package dasturlash.uz.controller;

import dasturlash.uz.dto.Profile;
import dasturlash.uz.enums.ProfileRole;
import dasturlash.uz.service.ProfileService;
import dasturlash.uz.service.ScannerService;
import dasturlash.uz.util.ScannerUtil;

public class ProfileController {
    private ProfileService profileService;
    private ScannerService scannerService;
    public void start() {
        boolean loop = true;
        while (loop) {
            showMenu();
            int action = ScannerUtil.getAction();
            switch (action) {
                case 1:
                  profileService.list();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    changeStatus();
                    break;
                case 4:
                    addProfile();
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Mazgi bu hatoku.");
            }
        }
    }

    public void showMenu() {
        System.out.println("*** Profile ***");
        System.out.println("1. Profile list");
        System.out.println("2. Search profile");
        System.out.println("3. Change profile status");
        System.out.println("4. Profile add");
        System.out.println("0. Exits");
    }


    public void addProfile() {
        System.out.print("Enter name: ");
        String name = scannerService.getScannerForStr().nextLine();

        System.out.print("Enter surname: ");
        String surname = scannerService.getScannerForStr().nextLine();

        System.out.print("Enter login: ");
        String login = scannerService.getScannerForStr().nextLine();

        System.out.print("Enter password: ");
        String password = scannerService.getScannerForStr().nextLine();

        System.out.print("Enter phone (9989x1234567): ");
        String phone = scannerService.getScannerForStr().nextLine();

        System.out.print("Enter role (STAFF,ADMIN) : ");
        String role = scannerService.getScannerForStr().nextLine();
        ProfileRole profileRole;
        try {
            profileRole = ProfileRole.valueOf(role);
        } catch (RuntimeException e) {
            System.out.println("Mazgi to'g'ri qiymat kiriting. Possible values (STAFF,ADMIN) ");
            return;
        }

        Profile profile = new Profile();
        profile.setName(name.trim());
        profile.setSurname(surname.trim());
        profile.setLogin(login.trim()); // valish
        profile.setPassword(password.trim()); // 222
        profile.setPhone(phone.trim());
        profile.setRole(profileRole);
        profileService.addProfile(profile);
    }

    public void search() {
        System.out.print("Enter query: ");
        String query = scannerService.getScannerForStr().nextLine();
         profileService.search(query, ProfileRole.ADMIN, ProfileRole.STAFF);
    }

    private void changeStatus() {
        System.out.print("Enter Id: ");
        Integer id = scannerService.getScannerForDigit().nextInt();
        profileService.changeStatus(id);
    }

    public void setProfileService(ProfileService profileService) {
        this.profileService = profileService;
    }

    public void setScannerService(ScannerService scannerService) {
        this.scannerService = scannerService;
    }
}

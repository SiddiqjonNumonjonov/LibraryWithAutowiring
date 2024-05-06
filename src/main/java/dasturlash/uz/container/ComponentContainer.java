package dasturlash.uz.container;

import dasturlash.uz.dto.Profile;
import dasturlash.uz.service.ScannerService;

import java.util.Scanner;

public class ComponentContainer {
    public static Profile currentProfile = new Profile();
    public static   Scanner scannerForDigit = new Scanner(System.in);
}

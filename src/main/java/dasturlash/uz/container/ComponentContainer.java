package dasturlash.uz.container;

import dasturlash.uz.dto.Profile;
import dasturlash.uz.service.ScannerService;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ComponentContainer {
    public static Profile currentProfile = new Profile();
    public static   Scanner scannerForDigit = new Scanner(System.in);
}

package dasturlash.uz.util;

import dasturlash.uz.container.ComponentContainer;
import dasturlash.uz.service.ScannerService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {
    public static int getAction() {
        System.out.print("Enter action: ");
        try {
            return ComponentContainer.scannerForDigit.nextInt();
        } catch (InputMismatchException e) {
            ComponentContainer.scannerForDigit = new Scanner(System.in);
            System.out.println("\nPlease enter number.\n");
            return -1;
        }
    }
}

package dasturlash.uz.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class ScannerService {
    private Scanner scannerForStr;
    private Scanner scannerForDigit;

    public ScannerService() {
        scannerForStr = new Scanner(System.in);
        scannerForDigit = new Scanner(System.in);
    }

    public Scanner getScannerForStr() {
        return scannerForStr;
    }

    public Scanner getScannerForDigit() {
        return scannerForDigit;
    }

    public void setScannerForStr(Scanner scannerForStr) {
        this.scannerForStr = scannerForStr;
    }

    public void setScannerForDigit(Scanner scannerForDigit) {
        this.scannerForDigit = scannerForDigit;
    }
}

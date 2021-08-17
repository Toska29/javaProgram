package chapterFive;

import java.util.Scanner;

public class NokiaMenuMap {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        FirstMenuMap.menu();
       int response = input.nextInt();
        switch (response){
            case 1:
                FirstMenuMap.phoneBook();
                int userOption = input.nextInt();
                FirstMenuMap.phonebookOption(userOption);
                if(!(userOption >= 1 && userOption<=10) ){
                    FirstMenuMap.menu();
                }
                main();
                break;
            case 2:
                FirstMenuMap.messages();
                userOption = input.nextInt();
                if(userOption == 7) {
                    FirstMenuMap.messageSettings(userOption);
                    userOption = input.nextInt();
                    FirstMenuMap.messageSettingsOptions(userOption);
                }
                if(!(userOption >= 1 && userOption<=10) ){
                    FirstMenuMap.menu();
                }
                break;
            case 3:
                break;
            case 4:
                FirstMenuMap.callRegister();
                userOption = input.nextInt();
                FirstMenuMap.callRegisterOptions(userOption);
                if(!(userOption >= 1 && userOption<=8) ){
                    FirstMenuMap.menu();
                }
                break;
            case 5:
                FirstMenuMap.tones();
                break;
            case 6:
                FirstMenuMap.settings();
                userOption = input.nextInt();
                FirstMenuMap.settingsOption(userOption);
                if(!(userOption >= 1 && userOption<=4) ){
                    FirstMenuMap.menu();
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                FirstMenuMap.clock();
                break;
            case 12:
                break;
            case 13:
                break;
            default:
                System.out.println("Home Screen");


        }

    }
}

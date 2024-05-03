package ex_240502_mini;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class mini_chat {
    private static final Map<String, String> contacts = new HashMap<>();
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n연락처 관리 프로그램");
            System.out.println("1. 연락처 입력");
            System.out.println("2. 연락처 출력");
            System.out.println("3. 연락처 검색");
            System.out.println("4. 연락처 삭제");
            System.out.println("5. 연락하고 싶은 멤버 랜덤 뽑기");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    randomContact();
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }

    private static void addContact() {
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();
        contacts.put(name, phoneNumber);
        System.out.println("연락처가 추가되었습니다.");
    }

    private static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("저장된 연락처가 없습니다.");
        } else {
            System.out.println("연락처 목록:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("이름: " + entry.getKey() + ", 전화번호: " + entry.getValue());
            }
        }
    }

    private static void searchContact() {
        System.out.print("검색할 이름을 입력하세요: ");
        String name = scanner.nextLine();
        String phoneNumber = contacts.get(name);
        if (phoneNumber != null) {
            System.out.println(name + "의 전화번호: " + phoneNumber);
        } else {
            System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
        }
    }

    private static void deleteContact() {
        System.out.print("삭제할 이름을 입력하세요: ");
        String name = scanner.nextLine();
        String phoneNumber = contacts.remove(name);
        if (phoneNumber != null) {
            System.out.println(name + "의 연락처가 삭제되었습니다.");
        } else {
            System.out.println("해당 이름의 연락처를 찾을 수 없습니다.");
        }
    }

    private static void randomContact() {
        if (contacts.isEmpty()) {
            System.out.println("저장된 연락처가 없습니다.");
        } else {
            Object[] keys = contacts.keySet().toArray();
            Object randomKey = keys[random.nextInt(keys.length)];
            String randomContact = (String) randomKey;
            System.out.println("랜덤으로 선택된 연락처: " + randomContact);
        }
    }
}

package slot12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho tin tức:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline sau khi nhập số nguyên
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Publish Date: ");
        String publishDate = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Content: ");
        String content = scanner.nextLine();

        New news = new New(id, title, publishDate, author, content);

        System.out.println("Nhập đánh giá (nhập -1 để kết thúc):");
        int rate;
        while (true) {
            System.out.print("Nhập đánh giá: ");
            rate = scanner.nextInt();
            if (rate == -1) {
                break;
            }
            news.inputRate(rate);
        }

        news.Display();
    }
}

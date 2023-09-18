import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    static ArrayList<Article> articles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ArticleNumber = 1;

        while (true) {
            System.out.print("명령어 : ");
            String command = scan.nextLine();

            if (command.equals("exit")) {
                System.out.println("시스템을 종료했습니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("제목을 입력해주세요 :");
                String title = scan.nextLine();
                System.out.print("내용을 입력해주세요 : ");
                String content = scan.nextLine();

                Article article = new Article(ArticleNumber, title, content);
                articles.add(article);
                System.out.println("게시물이 등록되었습니다");
                ArticleNumber++;
            } else if (command.equals("list")) {
                for (int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);
                    System.out.println("==============================");
                    System.out.printf("번호 : %d\n", article.getArticleNumber());
                    System.out.printf("제목 : %s\n", article.getTitle());
                    System.out.println("==============================");
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                for (int i = 0; i < articles.size(); i++) {
                    int targetId = scan.nextInt();
                    scan.nextLine();

                    if(articles == null ){
                        System.out.println("없는 게시물입니다");
                    }else {
                        System.out.println("제목 :");
                        String newTitle = scan.nextLine();
                        System.out.println("내용 :");
                        String newContent = scan.nextLine();

                        
                    }
                }
            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                for (int i = 0; i < articles.size(); i++) {
                    int targetId = scan.nextInt();
                    scan.nextLine();
                    if (articles == null){
                        System.out.println("없는 게시물입니다.");
                    }else {
                        articles.remove(targetId);
                        System.out.println("삭제되었습니다");
                    }


                }
            }
        }
    }
}



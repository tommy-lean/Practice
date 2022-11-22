package section11_Decomposition;

public class VerifiedComitMessages {
    public static void main(String[] args) {
        String commit = "Tema\n\nComment.\nI mean that this code is bullshit.\nI tried fix him.\nI fixed him!";

        validateMessage(commit);
    }

    private static void validateMessage(String commit) {
        boolean correct = false;
        String bodyCommit = definitionBodyOfCommit(commit);
        if (checkingByEmptyMessage(commit)) {
            System.out.println("IsNotEmpty");
            if (checkingBySubjectAndBodyAndLengthSubject50char(commit)) {
                System.out.println("subject \\n body");
                if (checkingCapitalLetterInSubject(commit)) {
                    System.out.println("SubjectWithCapital");
                    if (checkingThePointAfterSubject(commit)) {
                        System.out.println("NetTochki");
                        if (checkingMaxLengthOfStringInBody(bodyCommit)){
                            System.out.println("StringIsNotLimit");
                        }
                    }
                }
            }
        }
    }

    private static boolean checkingMaxLengthOfStringInBody(String bodyCommit) {
        boolean switching = false;
        int count = 0;
        int startIndex = 0;
        System.out.println(bodyCommit.length());
        for (int j = 0; j < bodyCommit.length(); j++) {
            if(startIndex == bodyCommit.length()){
                break;
            }
            switching = false;
            for (int i = startIndex; i < bodyCommit.length(); i++) {
                char ch = bodyCommit.charAt(i);
                count++;
                if (ch == '\n' || i == bodyCommit.length() - 1) {
                    switching = true;
                    count = 0;
                    startIndex = i+1;
                    break;
                }
                if (count > 72 && !switching) {
                    System.exit(5);
                }
            }
        }
        return true;
    }

    private static boolean checkingThePointAfterSubject(String commit) {
        boolean absencePoint = true;
        int maxLengthSubject = 50;
        for (int i = 0; i <= maxLengthSubject; i++) {
            char ch = commit.charAt(i);
            if (ch == '\n' && commit.charAt(i + 1) == '\n') {
                if (commit.charAt(i - 1) == '.') {
                    System.exit(4);
                } else {
                    break;
                }

            }

        }
        return absencePoint;
    }

    private static boolean checkingCapitalLetterInSubject(String commit) {
        boolean capital = true;
        String ch1 = String.valueOf(commit.charAt(0));
        String temp = String.valueOf(commit.charAt(0));
        String ch2 = temp.toUpperCase();
        if (!ch1.equals(ch2)) {
            System.exit(3);
        }
        return capital;
    }

    private static boolean checkingBySubjectAndBodyAndLengthSubject50char(String commit) {
        boolean subjectAndBody = false;
        int maxLengthSubject = 50;

        for (int j = 0; j < maxLengthSubject; j++) {
            char ch = commit.charAt(j);
            if (ch == '\n' && commit.charAt(j + 1) == '\n') {
                subjectAndBody = true;
                break;
            }
        }
        // проверка темы и тела и по лимиту символов
        if (!subjectAndBody) {
            System.exit(2);
        }
        return subjectAndBody;

    }


    private static boolean checkingByEmptyMessage(String commit) {
        boolean hasText = true;
        if (commit.length() == 0) {
            System.exit(1);
        }
        return hasText;
    }

    private static String definitionBodyOfCommit(String commit) {
        int lastIndexSubject = 0;
        for (int i = 0; i < commit.length(); i++) {
            if (commit.charAt(i) == '\n' && commit.charAt(i + 1) == '\n') {
                lastIndexSubject = i + 2;
            }
        }
        return commit.substring(lastIndexSubject);
    }


}

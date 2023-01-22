public class Main {

    public static void main(String[] args) {

        // вводим текст (строку) для проверки на полиндром
        String text = "madam";

        // выводим в консоль результат проверки
        if (isPalindrome(text)) {
            System.out.println(text + " is polindrome");
        } else {
            System.out.println(text + " is NOT polindrome");
        }
    }

    public static boolean isPalindrome(String text) {
        // убираем символы пробела и заглавные буквы
        String clean = text.replaceAll("\\s+", "").toLowerCase();

        // определяем длину строки и выставляем счетчики
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;

        // проматываем строку побуквенно и сравниваем каждый символ в прямом и обратном порядке
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            // присваиваем true или false в зависимости от результата
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

}
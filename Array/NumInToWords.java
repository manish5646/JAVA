public class NumInToWords {

    static String[] one = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };

    static String[] two = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"
    };

    public static void main(String[] args) {

        int num = 12345678;

        pw(num / 10000000, "Crore");
        pw((num / 100000) % 100, "Lakh");
        pw((num / 1000) % 100, "Thousand");
        pw((num / 100) % 10, "Hundred");

        if (num > 100 && num % 100 != 0) {
            System.out.print("and ");
        }

        pw(num % 100, "");
    }

    public static void pw(int num, String s) {

        if (num == 0)
            return;

        if (num <= 19) {
            System.out.print(one[num] + " ");
        } else {
            System.out.print(two[num / 10] + " " + one[num % 10] + " ");
        }

        if (!s.equals("")) {
            System.out.print(s + " ");
        }
    }
}

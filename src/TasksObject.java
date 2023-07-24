public class TasksObject {
    private String str;
    public TasksObject() {
        str = new String();
        str = "\"Someone's sitting in the shade today\n" +
                "because someone planted a tree a long time ago.\"" +
                "\n\t\t\t\t\t\t\t\t   Варон Буфет.";
    }
    public String getStr() {
        return this.str;
    }

    public String evenNumber(int a, int b) {
        String str = new String();
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                str += i + ", ";
            }
        }
        return str;
    }

    String line(int weight, String vektor, String symbol) {
        String str = new String();
        for (int i = 0; i < weight; i++) {
            if (vektor.equals("Horizon")) {
                str += symbol + "  ";
            } else if (vektor.equals("Vertical")) {
                str += symbol + "\n";
            }
        }
        return str;
    }

    int maxInt(String str) {
        String strs[] = str.split(" ");
        int array[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.parseInt(strs[i]);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int sumNumber(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }

    public boolean number(int a) {
        int count = 0;
        boolean answer = false;
        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public String happy(String str) {
            String result = new String();
            if (str.length() % 2 == 0) {
                String leftStr = str.substring(0, str.length() / 2);
                String rightStr = str.substring(str.length() / 2, str.length());
                int leftNumber = Integer.parseInt(leftStr);
                int rightNumber = Integer.parseInt(rightStr);
                int leftSum = 0;
                int rightSum = 0;
                for (int i = 0; i < str.length() / 2; i++) {
                    leftSum += leftNumber % 10;
                    leftNumber /= 10;
                    rightSum += rightNumber % 10;
                    rightNumber /= 10;
                }
                if (leftSum == rightSum) {
                    result = "Число счастливое";
                } else {
                    result = "Число обычное";
                }
            } else {
                result = "Число обычное";
            }
            return result;
        }

    public String happyTwo(String str) {
        String result = new String();
        if (str.length() % 2 == 0) {
            String leftStr = str.substring(0, str.length() / 2);
            String rightStr = str.substring(str.length() / 2, str.length());
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < leftStr.length(); i++) {
                leftSum += Integer.parseInt(String.valueOf(leftStr.charAt(i)));
                rightSum += Integer.parseInt(String.valueOf(rightStr.charAt(i)));
            }
            if (leftSum == rightSum) {
                result = "Число счастливое";
            } else {
                result = "Число обычное";
            }
        } else {
            result = "Число обычное";
        }
        return result;
    }
    }

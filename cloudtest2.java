package ab;

public class cloudtest2 {

    public static void main(String[] args)
    {
        String str = "X";
        int len = str.length();
        str = str + " ";
        int res = 0;
        for (int i = 0; i < len; i++)
        {
            char ch   = str.charAt(i);
            char next_char = str.charAt(i+1);

            if (ch == 'M')
            {
                res += 1000;
            }
            else if (ch == 'C')
            {
                if (next_char == 'M') {
                    res += 900;
                    i++;
                } else if (next_char == 'D') {
                    res += 400;
                    i++;
                } else {
                    res += 100;
                }
            }
            else if (ch == 'D')
            {
                res += 500;
            }
            else if (ch == 'X')
            {
                if (next_char == 'C') {
                    res += 90;
                    i++;
                } else if (next_char == 'L') {
                    res += 40;
                    i++;
                } else {
                    res += 10;
                }
            }
            else if (ch == 'L')
            {
                res += 50;
            }
            else if (ch == 'I')
            {
                if (next_char == 'X') {
                    res += 9;
                    i++;
                } else if (next_char == 'V') {
                    res += 4;
                    i++;
                } else {
                    res++;
                }
            }
            else
            {
                // if (ch == 'V')
                res += 5;
            }
        }
        System.out.println("Roman Number : "+str);
        System.out.println("Integer Number : "+res);
    }
}

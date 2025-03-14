
class Minimum_Window_Subsequence {

    public static String minWindow(String S, String T) {
        String str = "";

        int n = S.length();

        int m = T.length();

        int r = 0;

        int l = 0;

        int k = 0;

        int len = Integer.MAX_VALUE;

        while (r < n && k < m)

        {

            if (S.charAt(r) == T.charAt(k))

            {

                k++;

            }

            if (m == k)

            {

                l = r;

                k = m - 1;

                while (l >= 0 && k >= 0)

                {

                    if (S.charAt(l) == T.charAt(k))

                    {

                        k--;

                    }

                    l--;

                }

                l++;

                if (len > r - l + 1)

                {

                    len = r - l + 1;

                    str = S.substring(l, r + 1);

                }

                k = 0;

                r = l;

            }

            r++;

        }

        return str;
    }

    public static void main(String[] args) {

    }
}
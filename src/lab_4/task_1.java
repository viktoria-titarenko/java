package lab_4;

public class task_1 {
    public static void main(String[] args) {
        int n = 2;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))
                        System.out.println(a + "+" + b + "=" + c);
                }
            }
        }
    }
}
/*
3+4=5
4+3=5
5+12=13
6+8=10
7+24=25
8+6=10
8+15=17
9+12=15
9+40=41
10+24=26
11+60=61
12+5=13
12+9=15
12+16=20
12+35=37
13+84=85
14+48=50
15+8=17
15+20=25
15+36=39
16+12=20
16+30=34
16+63=65
18+24=30
18+80=82
20+15=25
20+21=29
20+48=52
21+20=29
21+28=35
21+72=75
24+7=25
24+10=26
24+18=30
24+32=40
24+45=51
24+70=74
25+60=65
27+36=45
28+21=35
28+45=53
30+16=34
30+40=50
30+72=78
32+24=40
32+60=68
33+44=55
33+56=65
35+12=37
35+84=91
36+15=39
36+27=45
36+48=60
36+77=85
39+52=65
39+80=89
40+9=41
40+30=50
40+42=58
40+75=85
42+40=58
42+56=70
44+33=55
45+24=51
45+28=53
45+60=75
48+14=50
48+20=52
48+36=60
48+55=73
48+64=80
51+68=85
52+39=65
54+72=90
55+48=73
56+33=65
56+42=70
57+76=95
60+11=61
60+25=65
60+32=68
60+45=75
60+63=87
63+16=65
63+60=87
64+48=80
65+72=97
68+51=85
70+24=74
72+21=75
72+30=78
72+54=90
72+65=97
75+40=85
76+57=95
77+36=85
80+18=82
80+39=89
84+13=85
84+35=91
*/
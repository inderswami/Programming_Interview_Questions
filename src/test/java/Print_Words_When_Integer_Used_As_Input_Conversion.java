public class Print_Words_When_Integer_Used_As_Input_Conversion {
    public static void main(String[] args) {
        int t=94;
        String[] D1={"","One","two","three","Four","Five","Six","Seven","Eight","Nine","Ten","eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        int a=t%10;
        int b=t/10;
        int c=b%10;
        String[] D3={"","Hunderied","Two Hunderied","Three hunderied","Four hunderied","Five Hunderied","Six Hunderied","Seven Hunderied","Eight hunderied","Nine Hunderied"};
        String[] D2={"","Ten","Tenty","Thirty","Fourty","Fifty","sixty","Seventy","Eigty","Ninty"};
        if (t<20){
            System.out.println(D2[t]);

        }
        else if(t>=20 && t<=100){
            System.out.print(D2[c]+" "+D1[a]);
        }


    }





}

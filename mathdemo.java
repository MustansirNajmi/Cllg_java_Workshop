//math class can be public, static, final its return type can be 
// java docs 8
// max
// min 
// sin 
// cos 
// tan 
// asin 
// acos 
// atan 
// pow 
// random
// floor 
// ceil 
// round 
// sqrt
class mathdemo
{
    public static void main(String[] args) 
    {
        int a[] = new int[10];
        int i;
        for(i=0; i<10;i++)
        {
            a[i]=(int)(Math.random()*50);
            System.out.print(" "+a[i]);
        }    
    }
}
//this gives nos including 0 and repetation remove them.
class UnaryOperator{

public static void main (String args[]){

int i = 10;
int j  = 20;
int k = ++i;   // 11

j++;   //20  ->21


System.out.println(j++);    //21   ->22 

System.out.println(i++);     //11  ->12

System.out.println(++k);   //12

System.out.println(i+j+k);     // 12+22+12

}
}
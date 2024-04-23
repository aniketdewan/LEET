public class Linearsearch {
    public static int findlinear( int num[],int key){
    for(int i=0;i<num.length;i++){
        if(num[i]==key){
            return i;
        }

    }
    return -1;

    }
    public static void main (String []args ){
         int num[]={4,8,0,7,9};
         int key =7;
         int index =findlinear(num,key);
         if(index==-1){
            System.out.println("not found ");
         }
         else{
            System.out.println("key is at index :" + index );
         }

    }
}

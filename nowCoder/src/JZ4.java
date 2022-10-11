public class JZ4 {
    public boolean Find(int target, int [][] array) {
        int m=array.length;
        if(m==0) return false;
        int n=array[0].length;

        int i=0,j=n-1;
        while(i<m&&j>=0){
            if(array[i][j]==target) return true;
            if(array[i][j]>target) j--;
            else i++;
        }
        return false;
    }
}
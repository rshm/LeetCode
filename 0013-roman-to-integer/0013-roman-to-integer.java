class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int value = 0;
        int v=0;
        for(int i = ch.length-1; i>=0; i--){
            switch(ch[i]){
                case 'I' -> v=1;
                case 'V' -> v=5;
                case 'X' -> v = 10;
                case 'L' -> v=50;
                case 'C' -> v = 100;
                case 'D' -> v=500;
                case 'M' -> v=1000;
            }
            if( v*4 < value) value-=v;
            else value+=v;
        }
        
        return value;
    }
}
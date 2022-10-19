class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int value = 0;
        int v=0;
        for(int i = ch.length-1; i>=0; i--){
            switch(ch[i]){
                case 'I' -> v = (i< ch.length-1 && (ch[i+1] == 'V' || ch[i+1] == 'X'))? -1: 1;
                case 'V' -> v=5;
                case 'X' -> v = (i< ch.length-1 && (ch[i+1] == 'L' || ch[i+1] == 'C'))? -10: 10;
                case 'L' -> v=50;
                case 'C' -> v = (i< ch.length-1 && (ch[i+1] == 'D' || ch[i+1] == 'M'))? -100: 100;
                case 'D' -> v=500;
                case 'M' -> v=1000;
            }
            value+=v;
        }
        
        return value;
    }
}
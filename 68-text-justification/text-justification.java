class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<words.length){
            int j=i;
            int line=0;
            while(j<words.length&&line+words[j].length()+(j-i)<=maxWidth){
                line+=words[j].length();
                j++;
            }
            int gap=j-i-1;
            StringBuilder sb=new StringBuilder();
            if(j==words.length||gap==0){
                for(int k=i;k<j;k++){
                sb.append(words[k]);
                if(k!=j-1){
                    sb.append(' ');
                }
                }
                while(sb.length()<maxWidth){
                    sb.append(' ');
                }
            }
            else{
                int totalspace=maxWidth-line;
                int space=totalspace/gap;
                int extra=totalspace%gap;
                for(int k=i;k<j;k++){
                    sb.append(words[k]);
                    if(k!=j-1){
                        for(int s=0;s<space;s++){
                            sb.append(' ');
                        }
                        if(extra>0){
                            sb.append(' ');
                            extra--;
                        }
                    }
                }
            }
            res.add(sb.toString());
            i=j;
        }
        return res;
    }
}
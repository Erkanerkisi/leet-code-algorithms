

int myAtoi(char * s){
    signed long int res = 0;
    signed long int maxRes = 2147483647;
    int maxFlag = 0;
    int whitespaceFlag = 0;
    int multiplier = 1;
    int signFlag = 0;
    int i = strlen(s)-1;
    long fctr = 1;
    char c;
    while(i>=0){
        c = s[i--];
        //printf("%c %d %d\n", c, signFlag, whitespaceFlag);
         if( c == '-' && signFlag == 0 && res > 0 &&  whitespaceFlag == 0){
            res *= -1;
            if(maxFlag == 1){
                res -= 1;
            }
             signFlag = 1;
         }else if(c == '+' && signFlag == 0 && res > 0 &&  whitespaceFlag == 0 ){
             signFlag = 1;
             continue;
         }else if((c == '+' || c == '-') && (signFlag ==1 || whitespaceFlag == 1)){
             res = 0;
             break;
         }else if(c == ' '){
             whitespaceFlag = 1;
             continue;
         }else if(c == '.' && res != 0){
             res = 0;
             fctr = 1;
             multiplier=1;
         }else if((int) c <48 || (int)c >57){
             res = 0;
             fctr = 1;
             multiplier = 1;
            continue;
        } else if(maxFlag == 0 ){
             if(whitespaceFlag == 1 ){
                 res=0;
                 fctr = 1;
                 multiplier = 1;
                 whitespaceFlag = 0;
             }  
             if(signFlag == 1 ){
                 res=0;
                 fctr = 1;
                 multiplier = 1;
                 signFlag = 0;
             }
            unsigned long long int tempRes = res + (((int)c-48)*fctr);
             //printf("%d %d %d %d\n",tempRes, res, multiplier,tempRes-1 );
             if(tempRes > maxRes ||tempRes < res || res > maxRes  || (multiplier ==10 && ((int)c-48) > 2) || (multiplier > 10 && ((int)c-48)!= 0)){
                 res = maxRes;
                 maxFlag = 1;
             }else{
                 res = tempRes;
                 if(multiplier <11){
                    fctr *=10;
                    multiplier++;
                 }
                 
             }
        }
    }
    return res;
}

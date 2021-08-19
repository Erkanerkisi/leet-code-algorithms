int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int*** res = NULL;
    int i = 0;
    int j;
    for(i = 0; i < numsSize; i++){
        for(j = i + 1; j < numsSize; j++){
            if(nums[i] + nums[j] == target){
                res = malloc(2* sizeof(int));
                res[0] = i;
                res[1] = j;
                    *returnSize = 2;
                break;
            }
        }
        if(res != NULL){
            break;
        }
    }
    return res;
}

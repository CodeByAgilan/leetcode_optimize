// class Solution {
//     public List<Integer> replaceNonCoprimes(int[] nums) {
//         Stack <Integer> rep =new Stack <>();
//         ArrayList <Integer> arr=new ArrayList<>();
//         for(int i=nums.length-1;i>=0;i--){
//             rep.push(nums[i]);
//         }
//         for(int i=0;i<rep.size()-1;i++){
//             if(rep.size()==1){
//                 arr.add(rep.pop());
//                 break;
//             }
//             int gcd=GCD(rep.get(i),rep.get(i+1));
//             if(gcd!=1){
//               int lcm = ((rep.get(i)*rep.get(i+1))/gcd);
//               rep.remove(i);
//               rep.remove(i);
//               rep.add(i,lcm);
//               i = Math.max(i - 1, 0);
//             }
//             if(gcd==1){
//                 arr.add(rep.get(i));
//                 rep.remove(i); 
//             }
//         }
//             return arr;
// }
//     public static int GCD(int a,int b){
//             if(b==0)
//                return a;
//             return GCD(b,a%b);
//    }
// }
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums) {
            while (!stack.isEmpty() && GCD(stack.peek(), num) > 1) {
                num = LCM(stack.pop(), num);
            }
            stack.push(num);
        }
        
        return new ArrayList<>(stack);
    }

    private int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }

    private int LCM(int a, int b) {
        return a / GCD(a, b) * b; 
    }
}



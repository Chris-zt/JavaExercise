//import java.util.Stack;
//
///**
// * 作者： chris
// * 时间:  2022-08-26
// */
//public class t234 {
//    public boolean isPalindrome(ListNode head) {
//        List a = head;
//        Stack<Integer> stack = new Stack<Integer>();
//        while (a != null){
//            stack.push(a.val);
//            a = a.next;
//        }
//        a = head;
//        while(a != null){
//            if(a.val != stack.pop()){
//                return false;
//            }
//            a = a.next;
//        }
//        return true;
//    }
//}

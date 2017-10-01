//0002
//AddTwoNumbers


public class AddTwoNumbers {       
      
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode a1 = l1;
            ListNode a2 = l2;
            int carry = 0;        
            ListNode temp = new ListNode(0);
            ListNode head = temp ;
            while((a1!=null) || (a2!=null) || (carry != 0)){
             
                int sum = ((a1==null)?0:a1.val)+((a2==null)?0:a2.val)+carry;
                carry = 0;
                if(sum >= 10){
                    carry = 1;
                    sum = sum-10;
                }            
                ListNode current = new ListNode(sum);
                temp.next = current;
                temp = current;
                a1 = (a1==null)?null:a1.next;
                a2 = (a2==null)?null:a2.next;
            }
            return head.next;
        }
    }


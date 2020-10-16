import java.util.*;
class Main
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");

        while(sc.hasNext()) {
            String input = sc.next();
            Stack<Character> brackets = new Stack();

            for(int i = 0; i < input.length(); ++i) {
                Character a = input.charAt(i);
                if (brackets.isEmpty()) {
                    brackets.add(a);
                } else {
                    if (a == '{' || a == '(' || a == '[') {
                        brackets.add(a);
                    }

                    if (a == '}') {
                        if ((Character)brackets.peek() == '{') {
                            brackets.pop();
                        } else {
                            brackets.push(a);
                        }
                    }

                    if (a == ')') {
                        if ((Character)brackets.peek() == '(') {
                            brackets.pop();
                        } else {
                            brackets.push(a);
                        }
                    }

                    if (a == ']') {
                        if ((Character)brackets.peek() == '[') {
                            brackets.pop();
                        } else {
                            brackets.push(a);
                        }
                    }
                }
            }

            if (brackets.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        sc.close();
    }
}

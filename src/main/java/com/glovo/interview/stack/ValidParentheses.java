package com.glovo.interview.stack;

import io.quarkus.runtime.util.StringUtil;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

@ApplicationScoped
public class ValidParentheses {

	/**
	 *  Time complexity of O(n) length of s
	 *  Space complexity of O(n) Stack stores n.length
	 * @param s
	 * @return
	 */
	public boolean isValidParentheses(String s) {
		if (StringUtil.isNullOrEmpty(s)) {
			return false;
		}
		Stack<Character> characterStack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				characterStack.push(c);
			} else {
				if (characterStack.isEmpty()) {
					return false;
				}
				char top = characterStack.peek();
				if ((top == '{' && c == '}') || (top == '(' && c == ')') || (top == '[' && c == ']')) {
					characterStack.pop();
				} else {
					return false;
				}
			}
		}
		return characterStack.isEmpty();
	}

	public boolean isValidParenthesesDeque(String s) {
		if (StringUtil.isNullOrEmpty(s)) {
			return false;
		}
		Deque<Character> characterStack = new ArrayDeque<>();

		for (char c : s.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				characterStack.push(c);
			} else {
				if (characterStack.isEmpty()) {
					return false;
				}
				char top = characterStack.peek();
				if ((top == '{' && c == '}') || (top == '(' && c == ')') || (top == '[' && c == ']')) {
					characterStack.pop();
				} else {
					return false;
				}
			}
		}
		return characterStack.isEmpty();
	}


}

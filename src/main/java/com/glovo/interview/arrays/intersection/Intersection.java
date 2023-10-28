package com.glovo.interview.arrays.intersection;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class Intersection {


	public boolean isIntersect(List<Integer> list1, List<Integer> list2) {
		if (list1.isEmpty() || list2.isEmpty()) {
			return false;
		}
		for (var l : list1) {
			for (var l1 : list2) {
				if (Objects.equals(l, l1)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isIntersect1(int[] list1, int[] list2) {
		if (list1.length == 0 || list2.length == 0) {
			return false;
		}
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (Objects.equals(list1[i], list2[j])) {
					return true;
				}
			}
		}
		return false;
	}
}

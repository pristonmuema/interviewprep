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
}

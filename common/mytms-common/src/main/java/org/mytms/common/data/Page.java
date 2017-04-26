package org.mytms.common.data;

import java.util.function.Function;

public interface Page<T> extends Slice<T> {

	int getTotalPages();

	long getTotalElements();

	<U> Page<U> map(Function<? super T, ? extends U> converter);
}

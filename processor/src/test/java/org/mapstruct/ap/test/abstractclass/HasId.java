/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.abstractclass;

/**
 * @author Andreas Gudian
 */
public interface HasId {
    /**
     * 获取当前实体的唯一标识符。
     *
     * @return 返回当前实体的唯一标识符，以Long类型表示。
     */
    Long getId();
}

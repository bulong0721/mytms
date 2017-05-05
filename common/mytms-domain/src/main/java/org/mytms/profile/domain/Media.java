package org.mytms.profile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_MEDIA")
@Cacheable
public class Media extends GenericEntity<Long, Media> {

    @Column(name = "URL", nullable = false, length = 255)
    protected String url;

    @Column(name = "TITLE", length = 20)
    protected String title;

    @Column(name = "ALT_TEXT", length = 60)
    protected String altText;

    @Column(name = "TAGS", length = 60)
    protected String tags;
}

package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_MOVEMENT_TRACK")
public class MovementTrack extends OrgAssignedEntity<Long, MovementTrack> {

}

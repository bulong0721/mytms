package org.mytms.transfer.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_MOVEMENT_TRACK")
public class MovementTrack extends OrgAssignedEntity<Long, MovementTrack> {

}

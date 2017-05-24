package org.mytms.customer.dto;

import java.util.List;

import lombok.*;

/**
 * Auto-generated by: OpenJPA ReverseMappingTool
 */
@Getter
@Setter
@NoArgsConstructor
public class LineDto {
    private Long id;

    private String departureCode;

    private String departureName;

    private String destinationCode;

    private String destinationName;

    private Integer businessType;

    private String deliveryArea;

    private String remark;

    private Integer orgId;

    private Integer vehicleType;

    private String vehicleSpec;

    private Double loadageTons;

    private Double loadageCubes;

    private String isTemperatureControl;

    private Double highestTemp;

    private Double lowestTemp;

    private Double transitTime;

    private Double transitPrice;

    private String hasLoad;

    private String hasLoadService;

    private Integer loadChargeWay;

    private Double loadPrice;

    private String hasUnload;

    private String hasUnloadService;

    private Integer unloadChargeWay;

    private Double unloadPrice;
}
package com.xmonster.howtaxing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class House extends BaseEntity{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long houseId;           // 주택ID

    @Column
    private Long userId;            // 사용자ID

    @Column
    private boolean isCurOwn;       // 현재보유여부

    @Column(columnDefinition = "char (1)")
    private String houseType;       // 주택유형

    @Column(length = 50)
    private String houseName;       // 주택명

    @Column(length = 50)
    private String houseDetailName; // 주택상세명

    @Column
    private LocalDate contractDate; // 계약일자

    @Column
    private LocalDate buyDate;      // 취득일자

    @Column
    private LocalDate moveInDate;   // 전입일자

    @Column
    private LocalDate moveOutDate;  // 전출일자

    @Column
    private LocalDate sellDate;     // 양도일자

    @Column
    private Long buyPrice;          // 취득금액

    @Column
    private Long sellPrice;         // 양도금액

    @Column
    private Long pubLandPrice;      // 공시지가

    @Column
    private Long kbMktPrice;        // KB시세

    @Column(length = 200)
    private String jibunAdr;        // 지번주소

    @Column(length = 200)
    private String roadnmAdr;       // 도로명주소

    @Column(columnDefinition = "char (25)")
    private String buildingMgmtNo;  // 건물관리번호

    @Column(length = 200)
    private String detailAdr;       // 상세주소

    @Column(columnDefinition = "char (10)")
    private String legalDstCode;    // 법정동코드

    @Column(length = 20)
    private String dong;            // 동

    @Column(length = 20)
    private String hosu;            // 호수

    @Column(precision = 7, scale = 3)
    private BigDecimal area;        // 전용면적

    @Column
    private boolean isDestruction;  // 멸실여부

    @Column(columnDefinition = "tinyint unsigned")
    private Integer ownerCnt;       // 소유자수

    @Column(columnDefinition = "tinyint unsigned")
    private Integer proportion;     // 본인지분비율

    @Column
    private boolean isMoveInRight;  // 입주권여부

    @Column(columnDefinition = "char (1)")
    private String sourceType;      // 출처구분
}
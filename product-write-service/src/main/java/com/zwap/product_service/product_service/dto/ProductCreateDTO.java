package com.zwap.product_service.product_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.zwap.common.common.VO.GeoData;
import lombok.Data;

@Data
public class ProductCreateDTO {
    private String userId;
    private String title;
    private String description;
    private String imagePath;
    private BigDecimal price;
    private Integer quantity;
    private String status;
    private Integer viewCnt;
    private LocalDateTime expiredAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String city;
    private String locationName;
    private String address;
    private GeoData geoData;
    private String placeId; // Google Maps Place ID
}
package com.project.ggosu.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EntityListeners(value = AuditingEntityListener.class)
@MappedSuperclass // BaseEntity 상속할 경우 필드를 컬럼으로 인식
public abstract class BaseEntity {
    
    // DB 생성 날짜
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    // DB 수정 날짜
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}

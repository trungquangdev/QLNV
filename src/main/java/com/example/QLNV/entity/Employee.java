package com.example.QLNV.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="nhan_vien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ma_nv")
    private String maNv;
    @Column(name = "ho_ten")
    private String hoTen;
    @Column
    private Integer tuoi;
    @Column(name = "gioi_tinh")
    private Boolean gioiTinh;
    @Column(name = "phong_ban")
    private String phongBan;
    @Column
    private Float luong;
}

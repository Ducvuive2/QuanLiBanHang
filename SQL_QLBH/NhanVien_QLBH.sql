


/*==============================================================*/
/* Table: NHANVIEN                                              */
/*==============================================================*/
create table NHANVIEN 
(
   MANHANVIEN                 CHAR(4)   not null,
   TENNHANVIEN                VARCHAR2(40),
   NGAYSINH              VARCHAR(20),
   GIOITINH             VARCHAR2(5),
   CMND                 VARCHAR2(10),
   DIACHI               VARCHAR2(50),
   SODT                 VARCHAR2(20),
   PASSWORD             VARCHAR2(20),
   constraint PK_NHANVIEN primary key (MANHANVIEN)
);
commit;


INSERT INTO NHANVIEN VALUES('NV01','Nguyen Nhu Nhut', '13/4/2006', 'Nu', '197402123', '432 Tran Hung Dao, Q5, TP HCM', '0927345678', '123456');
INSERT INTO NHANVIEN VALUES('NV02','Le Thi Phi Yen','21/4/2006', 'Nu', ' 205456372', 'Phan Thi Tu, Binh Chanh, TP HCM', '0987567390', '132465');
INSERT INTO NHANVIEN VALUES('NV03','Nguyen Van B','27/4/2006', 'Nam', '204678432', 'Lien ap 123, Binh Hung Hoa, Binh Tan, TP HCM', '0997047382','124356');
INSERT INTO NHANVIEN VALUES('NV04','Ngo Thanh Tuan','24/6/2006', 'Nam', '197506386', '345 Le Hong Phong, Q5, TP HCM', '0913758498', '213465');
INSERT INTO NHANVIEN VALUES('NV05','Nguyen Thi Truc Thanh','20/7/2006', 'Nu', '234564867', '32/2 An Duong Vuong, Q5, TP HCM', '0918590387', '643251');
CREATE TABLE User
(
  id INT(11) PRIMARY KEY NOT NULL,
  nickname VARCHAR(255),
  head_img VARCHAR(255),
  email VARCHAR(255),
  phone VARCHAR(45),
  username VARCHAR(255),
  password VARCHAR(255),
  c_t INT(11),
  u_t INT(11) COMMENT '本地用户表'
);
CREATE UNIQUE INDEX user_phone_uindex ON User (phone);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237953, '安建华', 'http://wx.qlogo.cn/mmopen/FMajU52WvbG7TrJWtUqW0LMrs9N4eRhbgFm5yAo5tGmD5hzpr9MOicc0JMj0DhYUIOk6Q49FyKibad3uExZVM1ibw/0', null, '13810202012', null, '123456', 1443922900, 1464075539);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237954, '张秀芝', 'http://wx.qlogo.cn/mmopen/RfEfu9rvNCL2oafDhCjwlSoJjy3vlKia4npZfeLel9PTn1KGVqElh7NchpaXkAGiaMzl1V1yWC33yL2YJo0IiaTuz4Q7nrSx9xY/0', null, '13439531593', null, '123456', 1444053652, 1464075539);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237955, '王新新', 'http://wx.qlogo.cn/mmopen/PiajxSqBRaEI5IPs8ZqrgcakyOKbsu98CCVYdNpNhay8xmicro8smWC6DpHAa80LvlQqibEL2EiaoO4l8S73hKZNrg/0', null, '18811096749', null, '123456', 1447704598, 1464075539);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237956, '杨日安', 'http://wx.qlogo.cn/mmopen/lH6Se2f0mU87LlyEJxjNgibMggzTbiaQwfmETqE9OttZGDSFg82MuZbEKVcSKHYS9S1jR5icQUAEOXAGeLn8tGE2PTjcKxI0icCL/0', null, '15801617710', null, '123456', 1442534252, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237957, '王磊', '', null, '13521108546', null, '123456', 1463980062, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237958, '邱春雨', 'http://wx.qlogo.cn/mmopen/PqcbQGRwSAiaqPnxNniayO2SVZeNtMhvHCQicfkSS90jJgqgqOxiawGcWFxBpIp6LicyL35cmx2icORrI0LjQlynvSZob0V1MeG8O3/0', null, '13810609067', null, '123456', 1447704581, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237959, '王克臣', 'http://wx.qlogo.cn/mmopen/eyu5PGLPuROicc3bmrk9yicl3yujFNnpm3WMyd3km5YCV3GCCnPzusbDXMSt5DSl1fGq9V7MofAW5sdpuYzwaqL6aOq7hbCQeV/0', null, '13522647112', null, '123456', 1447101591, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237960, '张广力', '', null, '13521206536', null, '123456', 1463980062, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237961, '张海青', '', null, '13021031588', null, '123456', 1463980062, 1464075540);
INSERT INTO passport.User (id, nickname, head_img, email, phone, password, c_t, u_t, username) VALUES (237962, '王安志', 'http://wx.qlogo.cn/mmopen/RfEfu9rvNCKz3N4uU7sNrZibNcyNcCicFePncRSJCmzK019JQk7KffPcbcqVzk6ic4kpoRbJvXvNqQemLNM0xE03L8hPbib9zAHM/0', null, '18800130475', null, '123456', 1450326449, 1464075540);
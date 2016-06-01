CREATE TABLE user
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nickname VARCHAR(255),
    head_img VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(45),
    password VARCHAR(255),
    c_t INT(11),
    u_t INT(11) COMMENT '本地用户表',
    status INT(11) DEFAULT '0'
);
CREATE UNIQUE INDEX iu_phone ON user (phone);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('安建华', 'http://wx.qlogo.cn/mmopen/FMajU52WvbG7TrJWtUqW0LMrs9N4eRhbgFm5yAo5tGmD5hzpr9MOicc0JMj0DhYUIOk6Q49FyKibad3uExZVM1ibw/0', 'gjy@163.com', '13810202012', '123456', 1443922900, 1464075539, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('张秀芝', 'http://wx.qlogo.cn/mmopen/RfEfu9rvNCL2oafDhCjwlSoJjy3vlKia4npZfeLel9PTn1KGVqElh7NchpaXkAGiaMzl1V1yWC33yL2YJo0IiaTuz4Q7nrSx9xY/0', 'gjy@163.com', '13439531593', '123456', 1444053652, 1464075539, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王新新', 'http://wx.qlogo.cn/mmopen/PiajxSqBRaEI5IPs8ZqrgcakyOKbsu98CCVYdNpNhay8xmicro8smWC6DpHAa80LvlQqibEL2EiaoO4l8S73hKZNrg/0', 'gjy@163.com', '18811096749', '123456', 1447704598, 1464075539, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('杨日安', 'http://wx.qlogo.cn/mmopen/lH6Se2f0mU87LlyEJxjNgibMggzTbiaQwfmETqE9OttZGDSFg82MuZbEKVcSKHYS9S1jR5icQUAEOXAGeLn8tGE2PTjcKxI0icCL/0', 'gjy@163.com', '15801617710', '123456', 1442534252, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王磊', '', 'gjy@163.com', '13521108546', '123456', 1463980062, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('邱春雨', 'http://wx.qlogo.cn/mmopen/PqcbQGRwSAiaqPnxNniayO2SVZeNtMhvHCQicfkSS90jJgqgqOxiawGcWFxBpIp6LicyL35cmx2icORrI0LjQlynvSZob0V1MeG8O3/0', 'gjy@163.com', '13810609067', '123456', 1447704581, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王克臣', 'http://wx.qlogo.cn/mmopen/eyu5PGLPuROicc3bmrk9yicl3yujFNnpm3WMyd3km5YCV3GCCnPzusbDXMSt5DSl1fGq9V7MofAW5sdpuYzwaqL6aOq7hbCQeV/0', 'gjy@163.com', '13522647112', '123456', 1447101591, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('张广力', '', 'gjy@163.com', '13521206536', '123456', 1463980062, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('张海青', '', 'gjy@163.com', '13021031588', '123456', 1463980062, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王安志', 'http://wx.qlogo.cn/mmopen/RfEfu9rvNCKz3N4uU7sNrZibNcyNcCicFePncRSJCmzK019JQk7KffPcbcqVzk6ic4kpoRbJvXvNqQemLNM0xE03L8hPbib9zAHM/0', 'gjy@163.com', '18800130475', '123456', 1450326449, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王爱林', '', 'gjy@163.com', '13381279150', '123456', 1463980062, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('甄跃民', '', 'gjy@163.com', '13601269471', '123456', 1463980062, 1464075540, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('陈新正', '', 'gjy@163.com', '13641337096', '123456', 1463980063, 1464075541, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('甄国兵', '', 'gjy@163.com', '13661261714', '123456', 1463980063, 1464075541, 0);
INSERT INTO onlineshop.user (nickname, head_img, email, phone, password, c_t, u_t, status) VALUES ('王刘军', '', 'gjy@163.com', '13641187991', '123456', 1463980063, 1464075541, 0);
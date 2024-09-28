CREATE DATABASE mydatabase;

USE mydatabase;

CREATE TABLE numbers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number INT NOT NULL
);


CREATE TABLE t_user_info123 (
    user_name  varchar(50) /*이름*/
);

--고객 정보 user_info
CREATE TABLE t_user_info (
    user_name  varchar(50), /*이름*/
    user_id  varchar(50), /*아이디*/
    user_pw  varchar(50),  /*패스워드*/
    user_email  varchar(50)  /*이메일주소*/
);

-- 선수정보 runner_info
CREATE TABLE t_runner_info (
    runner_name varchar(50), /*이름*/
    runner_age int, /*나이*/
    runner_group varchar(50), /*소속*/
    runner_weight int, /*몸무게*/
    runner_hight int, /*키*/
    runner_win_rate float/*승률*/
);


-- 경주정보 race_info
CREATE TABLE t_race_info (
    runner_name varchar(50), /*선수명*/
    race_dy varchar(50), /*일자*/
    race_cnt int, /*회차*/
    meet_no varchar(50) /*시행처*/
);

-- 승자정보 winner_info
CREATE TABLE t_winner_info (
    user_name varchar(50), /*고객명*/
    race_no varchar(50), /*경주번호*/
    win_type varchar(50), /*승식*/
    race_amt int, /*배팅금액*/
    win_rate float, /*배당*/
    ret_amt int/*환불금액*/
);


-- 구매정보 sell
CREATE TABLE t_sell(
    user_name varchar(50), /*고객명*/
    race_no varchar(50), /*경주번호*/
    win_type varchar(50), /*승식*/
    runner_no varchar(50), /*선수선택(1번~7번)*/
    bet_amt int, /*배팅금액*/
    win_rate float,/*배당*/
    ret_amt int/*환불금액  */
);

INSERT INTO t_sell (
    user_name,
    race_no,
    win_type,
    runner_no,
    bet_amt,
    win_rate,
    ret_amt
  )
VALUES (
    '홍길동',
    '111',
    '단승',
    '12',
    100,
    1.5,
    100*1.5
  );


INSERT INTO t_sell (
    user_name,
    race_no,
    win_type,
    runner_no,
    bet_amt,
    win_rate,
    ret_amt
  )
VALUES (
    'ksatterley0',
    '111',
    '단승',
    '12',
    100,
    1.5,
    100*1.5
  );

-- 자가진단정보 t_self_check
CREATE TABLE t_self_check(
    user_name varchar(50), /*고객명*/
    check_res varchar(50), /*진단결과*/
    check_score varchar(50), /*점수*/
    input_dy varchar(50) /*진단일자*/
);

insert into t_self_check values ('홍길동', '나쁨', '100', '20240926');
insert into t_self_check values ('ksatterley0', '나쁨', '100', '20240926');

-- 구매제한 t_self_Limit
CREATE TABLE t_self_limit(
    user_name varchar(50), /*고객명*/
    st_dy varchar(50), /*경주번호*/
    ed_dy varchar(50), /*승식*/
    day_limit_amt varchar(50), /*일일제한금액 dy로 수정*/
    mon_limit_amt int, /*주일제한금액*/
    year_limit_amt float /*달제한금액 yr로 수정*/
);

insert into t_self_limit values ('홍길동', '20240901', '20409030', 1000, 10000, 100000);
insert into t_self_limit values ('이길동', '20240901', '20409030', 1000, 10000, 100000);
insert into t_self_limit values ('ksatterley0', '20240901', '20409030', 1000, 10000, 100000);

-- 건전화정보 t_health
CREATE TABLE t_health(
    user_name varchar(50), /*고객명*/
    limit_st_dy varchar(50), /*시작일(베팅제한기간)*/
    limit_ed_dy varchar(50), /*종료일(베팅제한기간)*/
    input_dy varchar(50) /*입력일*/
);

insert into t_health values ('홍길동', '20240901', '20409030', '20230820');
insert into t_health values ('ksatterley0', '20240901', '20409030', '20230820');

-- 연동정보 t_fep_info
CREATE TABLE t_fep_info(
    user_name varchar(50), /*고객명*/
    in_amt varchar(50), /*입금액*/
    out_amt varchar(50), /*출금액*/
    rem_amt varchar(50) /*잔액*/
);

insert into t_fep_info values ('홍길동', 200, 100, 100);
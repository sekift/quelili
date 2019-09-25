# 数据库名为quelili

CREATE TABLE `que_album` (
  `albumId` int(11) NOT NULL,
  `albumName` varchar(256) DEFAULT '',
  `artistId` int(11) DEFAULT '0',
  `artistName` varchar(512) DEFAULT '',
  `isStar` tinyint(2) DEFAULT NULL,
  `pay` int(11) DEFAULT NULL,
  `pic` varchar(128) DEFAULT NULL,
  `language` varchar(64) DEFAULT '',
  `releaseDate` varchar(64) DEFAULT NULL,
  `albumInfo` varchar(15120) DEFAULT '',
  `curUrl` varchar(256) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`albumId`),
  KEY `idx_artistid` (`artistId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专辑详细信息';

CREATE TABLE `que_lyric` (
  `musicId` int(11) NOT NULL,
  `musicName` varchar(255) DEFAULT '',
  `albumId` int(11) DEFAULT '0',
  `albumName` varchar(256) DEFAULT '',
  `artistId` int(11) DEFAULT '0',
  `artistName` varchar(256) DEFAULT '',
  `lrcList` varchar(15210) DEFAULT '',
  `nsig1` varchar(32) DEFAULT '0',
  `nsig2` varchar(32) DEFAULT '0',
  `score100` int(11) DEFAULT '0',
  `playCnt` int(11) DEFAULT '0',
  `curUrl` varchar(256) DEFAULT '',
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT '',
  PRIMARY KEY (`musicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='有歌词详细信息';

CREATE TABLE `que_lyric_none` (
  `musicId` int(11) NOT NULL,
  `musicName` varchar(255) DEFAULT '',
  `albumId` int(11) DEFAULT '0',
  `albumName` varchar(256) DEFAULT '',
  `artistId` int(11) DEFAULT '0',
  `artistName` varchar(256) DEFAULT '',
  `lrcList` varchar(256) DEFAULT '',
  `nsig1` varchar(32) DEFAULT '0',
  `nsig2` varchar(32) DEFAULT '0',
  `score100` int(11) DEFAULT '0',
  `playCnt` int(11) DEFAULT '0',
  `curUrl` varchar(256) DEFAULT '',
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT '',
  PRIMARY KEY (`musicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='无歌词详细信息';

CREATE TABLE `que_music` (
  `musicId` int(11) NOT NULL,
  `musicRid` varchar(32) DEFAULT '',
  `musicName` varchar(255) DEFAULT '',
  `albumId` int(11) DEFAULT '0',
  `albumName` varchar(256) DEFAULT '',
  `artistId` int(11) DEFAULT '0',
  `artistName` varchar(256) DEFAULT '',
  `hasMv` tinyint(2) DEFAULT '0',
  `isStar` tinyint(2) DEFAULT '0',
  `isListenFee` tinyint(2) DEFAULT '0',
  `online` tinyint(2) DEFAULT '0',
  `pay` int(11) DEFAULT '0',
  `nationId` varchar(128) DEFAULT '0',
  `track` int(11) DEFAULT '0',
  `albumPic` varchar(255) DEFAULT '',
  `pic` varchar(255) DEFAULT '',
  `pic120` varchar(255) DEFAULT '',
  `hasLossless` tinyint(2) DEFAULT '0',
  `songTimeMinutes` varchar(16) DEFAULT '',
  `releaseDate` varchar(64) DEFAULT NULL,
  `duration` int(11) DEFAULT '0',
  `curUrl` varchar(256) DEFAULT '',
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT '',
  PRIMARY KEY (`musicId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='歌曲详细信息';

CREATE TABLE `que_singer_info` (
  `artistId` int(11) NOT NULL,
  `aartist` varchar(100) DEFAULT NULL,
  `artistName` varchar(100) DEFAULT NULL,
  `isStar` tinyint(2) DEFAULT NULL,
  `albumNum` int(11) DEFAULT NULL,
  `mvNum` int(11) DEFAULT NULL,
  `musicNum` int(11) DEFAULT NULL,
  `artistFans` int(11) DEFAULT NULL,
  `pic` varchar(128) DEFAULT NULL,
  `pic70` varchar(128) DEFAULT NULL,
  `pic120` varchar(128) DEFAULT NULL,
  `pic300` varchar(128) DEFAULT NULL,
  `curUrl` varchar(256) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `remark` varchar(256) DEFAULT NULL,
  `birthday` varchar(64) DEFAULT NULL,
  `country` varchar(64) DEFAULT '',
  `gener` varchar(16) DEFAULT '',
  `weight` varchar(16) DEFAULT '',
  `language` varchar(32) DEFAULT '',
  `upPcUrl` varchar(512) DEFAULT '',
  `birthplace` varchar(256) DEFAULT '',
  `constellation` varchar(128) DEFAULT '',
  `tall` varchar(128) DEFAULT '',
  `info` varchar(15120) DEFAULT '',
  PRIMARY KEY (`artistId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='歌手详细信息';

CREATE TABLE `que_singer_total` (
  `prefix` char(2) NOT NULL COMMENT '歌手前缀',
  `total` int(11) DEFAULT '0' COMMENT '歌手总数',
  `createTime` datetime NOT NULL,
  `updateTime` datetime NOT NULL,
  `remark` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`prefix`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='歌手总数表';

CREATE TABLE `sys_user` (
  `userid` bigint(20) NOT NULL,
  `usercode` varchar(32) DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  `userpass` varchar(128) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `unbl` tinyint(2) DEFAULT NULL,
  `entid` bigint(20) NOT NULL,
  `parententid` bigint(20) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  `invitecode` varchar(16) DEFAULT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';



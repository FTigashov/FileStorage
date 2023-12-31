module fileStorage.server {
    requires FileStorageAPI;
    requires java.logging;
    requires lombok;
    requires io.netty.transport;
    requires io.netty.codec;
    requires org.slf4j;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires jakarta.xml.bind;

    opens server.hibernate.entity;
    opens server.hibernate;
}
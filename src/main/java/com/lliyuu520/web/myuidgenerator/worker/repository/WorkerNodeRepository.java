package com.lliyuu520.web.myuidgenerator.worker.repository;

import com.lliyuu520.web.myuidgenerator.worker.entity.WorkerNodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerNodeRepository extends JpaRepository<WorkerNodeEntity,Long> {
    WorkerNodeEntity getWorkerNodeEntitiesByHostNameAndPort(String hostName,String port);

}

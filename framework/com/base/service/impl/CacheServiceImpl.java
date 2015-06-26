/**
 * <pre>
 * Copyright:		Copyright(C) 2011-2012
 * Filename:		com.base.service.impl.ServiceUtil.java
 * Class:			ServiceUtil
 * Date:			2012-9-14
 * Author:			Vigor
 * Version          1.1.0
 * Description:		
 *
 * </pre>
 **/
 
package com.base.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.base.service.CacheService;

/** 
 * 	
 * @author 	Vigor
 * Version  1.1.0
 * @since   2012-9-14 上午9:59:55 
 */
@Service
public class CacheServiceImpl implements CacheService {
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * @see com.base.service.CacheService#clearAllCache()
	 */
	public void clearAllCache() {
		em.getEntityManagerFactory().getCache().evictAll();
	}

}

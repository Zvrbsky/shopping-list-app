package com.example.mini_project.db

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class ProductRepository(private val productDao: ProductDao) {

    val allProducts: Flow<List<ProductEntity>> = productDao.getAllProducts()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(product: ProductEntity) {
        productDao.insert(product)
    }
}
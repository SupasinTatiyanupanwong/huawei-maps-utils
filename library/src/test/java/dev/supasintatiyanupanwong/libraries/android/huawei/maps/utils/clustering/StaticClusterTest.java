/*
 * Copyright 2020 Supasin Tatiyanupanwong
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.supasintatiyanupanwong.libraries.android.huawei.maps.utils.clustering;

import com.huawei.hms.maps.model.LatLng;
import dev.supasintatiyanupanwong.libraries.android.huawei.maps.utils.clustering.algo.StaticCluster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;

public class StaticClusterTest {
    @Test
    public void testEquality() {
        StaticCluster<ClusterItem> cluster1 = new StaticCluster<>(new LatLng(0.1, 0.5));
        StaticCluster<ClusterItem> cluster2 = new StaticCluster<>(new LatLng(0.1, 0.5));

        assertEquals(cluster1, cluster2);
        assertNotSame(cluster1, cluster2);
        assertEquals(cluster1.hashCode(), cluster2.hashCode());
    }

    @Test
    public void testUnequality() {
        StaticCluster<ClusterItem> cluster1 = new StaticCluster<>(new LatLng(0.1, 0.5));
        StaticCluster<ClusterItem> cluster2 = new StaticCluster<>(new LatLng(0.2, 0.3));

        assertNotEquals(cluster1, cluster2);
        assertNotEquals(cluster1.hashCode(), cluster2.hashCode());
    }
}

<<<<<<< HEAD
# HUAWEI Map Kit Utility Library (Unofficial)
=======
![Build Status](https://github.com/googlemaps/android-maps-utils/actions/workflows/test.yml/badge.svg?branch=main)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.google.maps.android/android-maps-utils/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.google.maps.android/android-maps-utils)
![GitHub contributors](https://img.shields.io/github/contributors/googlemaps/android-maps-utils?color=green)
[![Discord](https://img.shields.io/discord/676948200904589322)](https://discord.gg/hYsWbmk)
![Apache-2.0](https://img.shields.io/badge/license-Apache-blue)
>>>>>>> v2.4.1

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.supasintatiyanupanwong.libraries.android.huawei.maps/maps-utils/badge.svg)](https://central.sonatype.com/artifact/dev.supasintatiyanupanwong.libraries.android.huawei.maps/maps-utils)
[![javadoc](https://javadoc.io/badge2/dev.supasintatiyanupanwong.libraries.android.huawei.maps/maps-utils/javadoc.svg)](https://javadoc.io/doc/dev.supasintatiyanupanwong.libraries.android.huawei.maps/maps-utils)
[![license](https://img.shields.io/github/license/SupasinTatiyanupanwong/huawei-maps-utils.svg)](https://www.apache.org/licenses/LICENSE-2.0)

<table>
<tr>
<th align="center">
Latest Update
</th>
<th align="center">
Current Stable Release
</th>
<th align="center">
Next Release Candidate
</th>
<th align="center">
Beta Release
</th>
<th align="center">
Alpha Release
</th>
</tr>
<tr>
<td align="center">
September 9, 2024
</td>
<td align="center">
-
</td>
<td align="center">
-
</td>
<td align="center">
-
</td>
<td align="center">
<a href="RELEASE_NOTES.md#version-100-alpha03---september-9-2024">1.0.0-alpha03</a>
</td>
</tr>
</table>

## Description

Utilities that are useful for a wide range of applications using the [HUAWEI Map Kit](https://developer.huawei.com/consumer/en/hms/huawei-MapKit).

- **Marker clustering** — handles the display of a large number of points
- **Heat maps** — display a large number of points as a heat map
- **IconGenerator** — display text on your Markers
- **Poly decoding and encoding** — compact encoding for paths, interoperability with Maps API web services
- **Spherical geometry** — for example: computeDistance, computeHeading, computeArea
- **KML** — displays KML data
- **GeoJSON** — displays and styles GeoJSON data

Forked from the [Maps SDK for Android Utility Library](https://github.com/googlemaps/android-maps-utils).

## Declaring dependencies

To add a dependency on HUAWEI Map Kit Utility Library (Unofficial), you must add the JCenter Maven and Huawei Maven repositories to your project.

<<<<<<< HEAD
Add the dependencies for the artifacts you need in the `build.gradle` file for your app or module:

```groovy
dependencies {
    implementation 'dev.supasintatiyanupanwong.libraries.android.huawei.maps:maps-utils:1.0.0-alpha03'
}  
```

For more information about dependencies, see [Add build dependencies](https://developer.android.com/studio/build/dependencies).
=======
You can view the generated [reference docs][javadoc] for a full list of classes and their methods.

## Requirements

* Android API level 15+
* Maps SDK via Google Play Services ~OR (Deprecated) [Maps SDK v3 BETA] library~

## Installation

```groovy
dependencies {
    // Utilities for Maps SDK for Android (requires Google Play Services) 
    implementation 'com.google.maps.android:android-maps-utils:2.4.1'

    // (Deprecated) Alternately - Utilities for Maps SDK v3 BETA for Android (does not require Google Play Services)
    implementation 'com.google.maps.android:android-maps-utils-v3:2.4.1'
}
```

_**Note**: The Beta version of the SDK is deprecated and scheduled for decommissioning. A future version of the SDK will provide similar support for Beta features. See the [release notes](https://developers.google.com/maps/documentation/android-sdk/releases#2021-08-18) for more information._

## Demo App
>>>>>>> v2.4.1

## Feedback

Your feedback helps make this library better. Let us know if you discover new issues or have ideas for improving this library. Please take a look at the [existing issues](https://github.com/SupasinTatiyanupanwong/huawei-maps-utils/issues) in this library before you create a new one.

<<<<<<< HEAD
Please keep in mind that the goal of this library is to provides the same functionality of the original one to the [HUAWEI Map Kit](https://developer.huawei.com/consumer/en/hms/huawei-MapKit). We will periodically keep this fork in sync.

## License
=======
The version that depends on the Maps SDK for Android can be found under the `gms` Gradle product flavor, while version that depends on the Maps SDK V3 BETA can be found under the `v3` Gradle product flavor. The active product flavor can be modified through Android Studio’s [“Build Variants”](https://developer.android.com/studio/run#changing-variant) toolbar options.

To run the demo app, you'll have to:

1. [Get a Maps API key](https://developers.google.com/maps/documentation/android-sdk/get-api-key)
1. Open the file `local.properties` in the root project (this file should *NOT* be under version control to protect your API key)
1. Add a single line to `local.properties` that looks like `MAPS_API_KEY=YOUR_API_KEY`, where `YOUR_API_KEY` is the API key you obtained in the first step
1. Build and run the `gmsDebug` variant for the Maps SDK for Android version, or `v3Debug` for the Maps SDK v3 BETA version
>>>>>>> v2.4.1

```
Copyright 2020 Supasin Tatiyanupanwong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<<<<<<< HEAD
   http://www.apache.org/licenses/LICENSE-2.0
=======
If you use one of Manager objects in the package `com.google.maps.android` (e.g. `GroundOverlayManager`, `MarkerManager`, etc.), say from adding a KML layer, GeoJson layer, or Clustering, you will have to rely on the Collection specific to add an object to the map rather than adding that object directly to `GoogleMap`. This is because each Manager sets itself as a click listener so that it can manage click events coming from multiple layers.
>>>>>>> v2.4.1

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
<<<<<<< HEAD
=======

_Old_

```java
GroundOverlayOptions options = // ...
googleMap.addGroundOverlay(options);
```

This same pattern applies for `Marker`, `Circle`, `Polyline`, and `Polygon`.

### Adding a Custom Info Window
If you use `MarkerManager`, adding an `InfoWindowAdapter` and/or an `OnInfoWindowClickListener` should be done on the `MarkerManager.Collection` object.

_New_
```java
CustomInfoWindowAdapter adapter = // ...
OnInfoWindowClickListener listener = // ...

// Create a new Collection from a MarkerManager
MarkerManager markerManager = // ...
MarkerManager.Collection collection = markerManager.newCollection();

// Set InfoWindowAdapter and OnInfoWindowClickListener
collection.setInfoWindowAdapter(adapter);
collection.setOnInfoWindowClickListener(listener);

// Alternatively, if you are using clustering
ClusterManager<ClusterItem> clusterManager = // ...
MarkerManager.Collection markerCollection = clusterManager.getMarkerCollection();
markerCollection.setInfoWindowAdapter(adapter);
markerCollection.setOnInfoWindowClickListener(listener);
```

_Old_
```java
CustomInfoWindowAdapter adapter = // ...
OnInfoWindowClickListener listener = // ...
googleMap.setInfoWindowAdapter(adapter);
googleMap.setOnInfoWindowClickListener(listener);
```

### Adding a Marker Drag Listener

If you use `MarkerManager`, adding an `OnMarkerDragListener` should be done on the `MarkerManager.Collection` object.

_New_
```java
// Create a new Collection from a MarkerManager
MarkerManager markerManager = // ...
MarkerManager.Collection collection = markerManager.newCollection();

// Add markers to collection
MarkerOptions markerOptions = // ...
collection.addMarker(markerOptions);
// ...

// Set OnMarkerDragListener
GoogleMap.OnMarkerDragListener listener = // ...
collection.setOnMarkerDragListener(listener);

// Alternatively, if you are using clustering
ClusterManager<ClusterItem> clusterManager = // ...
MarkerManager.Collection markerCollection = clusterManager.getMarkerCollection();
markerCollection.setOnMarkerDragListener(listener);
```

_Old_
```java
// Add markers
MarkerOptions markerOptions = // ...
googleMap.addMarker(makerOptions);

// Add listener
GoogleMap.OnMarkerDragListener listener = // ...
googleMap.setOnMarkerDragListener(listener);
```

### Clustering

[A bug](https://github.com/googlemaps/android-maps-utils/issues/90) was fixed in v1 to properly clear and re-add markers via the `ClusterManager`.

For example, this didn't work pre-v1, but works for v1 and later:

```java
clusterManager.clearItems();
clusterManager.addItems(items);
clusterManager.cluster();
```

If you're using custom clustering (i.e, if you're extending `DefaultClusterRenderer`), you must override two additional methods in v1:
*  `onClusterItemUpdated()` - should be the same* as your `onBeforeClusterItemRendered()` method
*  `onClusterUpdated()` - should be the same* as your `onBeforeClusterRendered()` method

**Note that these methods can't be identical, as you need to use a `Marker` instead of `MarkerOptions`*

See the [`CustomMarkerClusteringDemoActivity`](demo/src/gms/java/com/google/maps/android/utils/demo/CustomMarkerClusteringDemoActivity.java) in the demo app for a complete example.

_New_

```java
    private class PersonRenderer extends DefaultClusterRenderer<Person> {
        ...     
        @Override
        protected void onBeforeClusterItemRendered(Person person, MarkerOptions markerOptions) {
            // Draw a single person - show their profile photo and set the info window to show their name
            markerOptions
                    .icon(getItemIcon(person))
                    .title(person.name);
        }
        
        /**
         * New in v1 
         */
        @Override
        protected void onClusterItemUpdated(Person person, Marker marker) {
            // Same implementation as onBeforeClusterItemRendered() (to update cached markers)
            marker.setIcon(getItemIcon(person));
            marker.setTitle(person.name);
        }
        
        @Override
        protected void onBeforeClusterRendered(Cluster<Person> cluster, MarkerOptions markerOptions) {
            // Draw multiple people.
            // Note: this method runs on the UI thread. Don't spend too much time in here (like in this example).
            markerOptions.icon(getClusterIcon(cluster));
        }
       
        /**
         * New in v1 
         */
        @Override
        protected void onClusterUpdated(Cluster<Person> cluster, Marker marker) {
            // Same implementation as onBeforeClusterRendered() (to update cached markers)
            marker.setIcon(getClusterIcon(cluster));
        }
        ...
    }
```

_Old_

```java
    private class PersonRenderer extends DefaultClusterRenderer<Person> {
        ...       
        @Override
        protected void onBeforeClusterItemRendered(Person person, MarkerOptions markerOptions) {
            // Draw a single person - show their profile photo and set the info window to show their name
            markerOptions
                    .icon(getItemIcon(person))
                    .title(person.name);
        }
        
        @Override
        protected void onBeforeClusterRendered(Cluster<Person> cluster, MarkerOptions markerOptions) {
            // Draw multiple people.
            // Note: this method runs on the UI thread. Don't spend too much time in here (like in this example).
            markerOptions.icon(getClusterIcon(cluster));
        }
        ...
    }
```

## Support

Encounter an issue while using this library?

If you find a bug or have a feature request, please [file an issue].
Or, if you'd like to contribute, send us a [pull request] and refer to our [code of conduct].

You can also reach us on our [Discord channel].

For more information, check out the detailed guide on the
[Google Developers site][devsite-guide].

[Maps SDK v3 BETA]: https://developers.google.com/maps/documentation/android-sdk/v3-client-migration
[file an issue]: https://github.com/googlemaps/android-maps-utils/issues/new/choose
[pull request]: https://github.com/googlemaps/android-maps-utils/compare
[code of conduct]: CODE_OF_CONDUCT.md
[Discord channel]: https://discord.gg/hYsWbmk
[android-site]: https://developer.android.com/training/maps/index.html
[devsite-guide]: https://developers.google.com/maps/documentation/android-api/utility/
[javadoc]: https://www.javadoc.io/doc/com.google.maps.android/android-maps-utils/latest/index.html
[android-maps-ktx]: https://github.com/googlemaps/android-maps-ktx
>>>>>>> v2.4.1

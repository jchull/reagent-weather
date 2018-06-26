(ns reagent-weather.core
  (:require [reagent.core :as r
             :refer           [atom]]
            [reagent-weather.quick-zipcode-forecast :as quick-zipcode-forecast]))

(enable-console-print!)

;; Application state definition
(defonce app-state (atom {:zipcode "" :forecast {}}))

(def quick-zipcode-forecast quick-zipcode-forecast)


;; TODO: weather underground key missing message
(defn reagent-weather []
  [:div.weather-app
   [:div.header
    [:img.logo {:src "logo.svg"}]
    [:img.logo {:src "cljs.svg"} ]
    [:h2 "Reagent ClojureScript Weather"]]
   [quick-zipcode-forecast]
   ])

;; Application entry point
(r/render-component [reagent-weather]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc))
  )


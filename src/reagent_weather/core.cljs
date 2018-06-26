(ns reagent-weather.core
  (:require [reagent.core :as r
             :refer           [atom]]
            [reagent-weather.quick-zipcode-forecast.component :refer [quick-zipcode-forecast]]))

(enable-console-print!)


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


